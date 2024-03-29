package main

import (
	"fmt"
	"log"
	"net/http"

	"github.com/labstack/echo/v4"
)

func LogInfo(logger *log.Logger) echo.MiddlewareFunc {
	return func(next echo.HandlerFunc) echo.HandlerFunc {
		return func(c echo.Context) error {
			out := map[string]interface{}{
				"method":     c.Request().Method,
				"user_ip":    c.RealIP(),
				"scheme":     c.Scheme(),
				"url_path":   c.Request().URL.Path,
				"user_agent": c.Request().UserAgent(),
			}
			logger.Print(fmt.Sprintf("%v", out))

			return next(c)
		}
	}
}

func main() {
	e := echo.New()
	e.GET("api/v1/endpoint/status", func(c echo.Context) error {
		return c.String(http.StatusOK, "Hello, World!")
	})
	logger := log.Default()
	e.Use(LogInfo(logger))
	e.Logger.Fatal(e.Start(":1903"))
}
