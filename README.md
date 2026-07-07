# Climalert

Sistema de monitoreo climático y envío automático de alertas — Trabajo práctico UTN.BA, DSI.

## Stack
- Java 17 / Spring Boot
- WeatherAPI (integración REST)
- Spring Scheduler (@Scheduled)
- Spring Mail

## Configuración
Variables de entorno necesarias:
- WEATHER_API_KEY
- MAIL_PASSWORD

## Cómo correr
mvnw spring-boot:run
