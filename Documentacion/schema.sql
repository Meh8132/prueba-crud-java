-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler version: 0.9.4
-- PostgreSQL version: 13.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file. 
-- These commands were put in this file only as a convenience.
-- 
-- object: new_database | type: DATABASE --
-- DROP DATABASE IF EXISTS new_database;
CREATE DATABASE new_database;
-- ddl-end --


-- object: public."Turista" | type: TABLE --
-- DROP TABLE IF EXISTS public."Turista" CASCADE;
CREATE TABLE public."Turista" (
	"IdTurista" smallint NOT NULL,
	"TipoIdentificacion" varchar NOT NULL,
	"NombreCompleto" varchar NOT NULL,
	"FechaNacimiento" date NOT NULL,
	"FrecuenciaViaje" smallint,
	"PresupuestoViaje" double precision,
	"UsaTarjeta" boolean NOT NULL,
	"IdCiudad_Ciudad" smallint,
	CONSTRAINT "Turista_pk" PRIMARY KEY ("IdTurista")
);
-- ddl-end --
ALTER TABLE public."Turista" OWNER TO postgres;
-- ddl-end --

-- object: public."Ciudad" | type: TABLE --
-- DROP TABLE IF EXISTS public."Ciudad" CASCADE;
CREATE TABLE public."Ciudad" (
	"IdCiudad" smallint NOT NULL,
	"Nombre" varchar NOT NULL,
	"CantidadHabitantes" smallint NOT NULL,
	"SitioTuristico" varchar,
	"Hotel" varchar,
	CONSTRAINT "Ciudad_pk" PRIMARY KEY ("IdCiudad")
);
-- ddl-end --
ALTER TABLE public."Ciudad" OWNER TO postgres;
-- ddl-end --

-- object: public."Asignacion" | type: TABLE --
-- DROP TABLE IF EXISTS public."Asignacion" CASCADE;
CREATE TABLE public."Asignacion" (
	"IdAsignacion" smallint NOT NULL,
	"Fecha" date NOT NULL,
	"EstaActiva" boolean NOT NULL,
	"IdTurista_Turista" smallint,
	"IdCiudad_Ciudad" smallint,
	CONSTRAINT "Asignacion_pk" PRIMARY KEY ("IdAsignacion")
);
-- ddl-end --
ALTER TABLE public."Asignacion" OWNER TO postgres;
-- ddl-end --

-- object: "Turista_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Asignacion" DROP CONSTRAINT IF EXISTS "Turista_fk" CASCADE;
ALTER TABLE public."Asignacion" ADD CONSTRAINT "Turista_fk" FOREIGN KEY ("IdTurista_Turista")
REFERENCES public."Turista" ("IdTurista") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Ciudad_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Turista" DROP CONSTRAINT IF EXISTS "Ciudad_fk" CASCADE;
ALTER TABLE public."Turista" ADD CONSTRAINT "Ciudad_fk" FOREIGN KEY ("IdCiudad_Ciudad")
REFERENCES public."Ciudad" ("IdCiudad") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: "Ciudad_fk" | type: CONSTRAINT --
-- ALTER TABLE public."Asignacion" DROP CONSTRAINT IF EXISTS "Ciudad_fk" CASCADE;
ALTER TABLE public."Asignacion" ADD CONSTRAINT "Ciudad_fk" FOREIGN KEY ("IdCiudad_Ciudad")
REFERENCES public."Ciudad" ("IdCiudad") MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


