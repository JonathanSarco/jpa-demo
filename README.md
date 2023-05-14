# JPA Demo

This projects presents a problem that we found out while working on some projects.

## Problem

While migrating to Spring Boot 3.0, there is a need to update to Hibernate 6. No bigger issues where found whilst doing it.
However, when using hierarchies on tables, Hibernate (core) does not know how to resolve it (at least for now).

Disclaimer:
The same scenario was working on a previous version of hibernate.

## Current version

- SpringBoot-3.0.6
- hibernate-6.2.2.Final
  - excluding from spring-boot-starter-data-jpa download an older version (I think it's 6.2.1-Final up to today).
  - adding specific version.


## How To

To test the application and see the error: `java.lang.NullPointerException: Parameter specified as non-null is null: method nl.jonivan.jpademo.model.Car.<init>`

- Run `docker compose up`
  - It will run a postgresql DB.
- Run tests:
  - `mvn test`
  - If you are on IntelliJ, the file `test/kotlin/nl.jonivan.jpademo/service/VehicleServiceTest` can be executed.


