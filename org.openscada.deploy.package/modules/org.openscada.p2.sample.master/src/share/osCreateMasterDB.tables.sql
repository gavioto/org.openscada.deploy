
-- CA

CREATE TABLE openscada_ca
(
  instance_id character varying(255) NOT NULL,
  factory_id character varying(255) NOT NULL,
  configuration_id character varying(255) NOT NULL,
  ca_key character varying(512) NOT NULL,
  ca_value character varying(4000),
  chunk_seq integer NOT NULL,
  CONSTRAINT openscada_ca_pkey PRIMARY KEY (instance_id , factory_id , configuration_id , ca_key , chunk_seq )
)
WITH (
  OIDS=FALSE
);

ALTER TABLE openscada_ca
  OWNER TO openscada;

CREATE INDEX openscada_ca_idx_1
  ON openscada_ca
  USING btree
  (instance_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ca_idx_2
  ON openscada_ca
  USING btree
  (instance_id COLLATE pg_catalog."default" , factory_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ca_idx_3
  ON openscada_ca
  USING btree
  (instance_id COLLATE pg_catalog."default" , factory_id COLLATE pg_catalog."default" , configuration_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ca_idx_4
  ON openscada_ca
  USING btree
  (instance_id COLLATE pg_catalog."default" , factory_id COLLATE pg_catalog."default" , configuration_id COLLATE pg_catalog."default" , ca_key COLLATE pg_catalog."default" );

-- DS

CREATE TABLE openscada_ds
(
  instance_id character varying(255) NOT NULL,
  node_id character varying(512) NOT NULL,
  data character varying(4000),
  sequence_nr integer NOT NULL,
  CONSTRAINT openscada_ds_pkey PRIMARY KEY (instance_id , node_id , sequence_nr )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE openscada_ds
  OWNER TO openscada;

CREATE INDEX openscada_ds_idx_1
  ON openscada_ds
  USING btree
  (instance_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ds_idx_2
  ON openscada_ds
  USING btree
  (node_id COLLATE pg_catalog."default" , instance_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ds_idx_3
  ON openscada_ds
  USING btree
  (instance_id COLLATE pg_catalog."default" , sequence_nr );

CREATE INDEX openscada_ds_idx_4
  ON openscada_ds
  USING btree
  (node_id COLLATE pg_catalog."default" , instance_id COLLATE pg_catalog."default" , sequence_nr );

-- AE

-- DROP TABLE openscada_ae_events
-- DROP TABLE openscada_ae_events_attr

CREATE TABLE openscada_ae_events
(
  id                           CHAR(36) NOT NULL,
  source_timestamp             TIMESTAMP,
  entry_timestamp              TIMESTAMP,
  instance_id                  VARCHAR(32),
  monitor_type                 VARCHAR(32),
  event_type                   VARCHAR(32),
  value_type                   VARCHAR(32),
  value_string                 VARCHAR(4000),
  value_integer                BIGINT,
  value_double                 DOUBLE PRECISION,
  message                      VARCHAR(4000),
  message_code                 VARCHAR(255),
  priority                     SMALLINT,
  source                       VARCHAR(255),
  actor_name                   VARCHAR(128),
  actor_type                   VARCHAR(32),
  severity                     VARCHAR(32),
  replicated                   SMALLINT,
  CONSTRAINT openscada_ae_events_pkey PRIMARY KEY (id)
);

CREATE TABLE openscada_ae_events_attr
(
  id                           CHAR(36) NOT NULL,
  key                          VARCHAR(64) NOT NULL,
  value_type                   VARCHAR(32),
  value_string                 VARCHAR(4000),
  value_integer                BIGINT,
  value_double                 DOUBLE PRECISION,
  CONSTRAINT openscada_ae_events_attr_pkey PRIMARY KEY (id , key),
  CONSTRAINT openscada_ae_events_attr_id_fkey FOREIGN KEY (id)
      REFERENCES openscada_ae_events (id) ON DELETE CASCADE
);

CREATE INDEX openscada_ae_events_idx_1 ON openscada_ae_events (source_timestamp);
CREATE INDEX openscada_ae_events_idx_1d ON openscada_ae_events (source_timestamp DESC);
CREATE INDEX openscada_ae_events_idx_2 ON openscada_ae_events (entry_timestamp);
CREATE INDEX openscada_ae_events_idx_2d ON openscada_ae_events (entry_timestamp DESC);
CREATE INDEX openscada_ae_events_idx_3 ON openscada_ae_events (instance_id);
CREATE INDEX openscada_ae_events_idx_4 ON openscada_ae_events (monitor_type);
CREATE INDEX openscada_ae_events_idx_4l ON openscada_ae_events (lower(monitor_type));
CREATE INDEX openscada_ae_events_idx_5 ON openscada_ae_events (event_type);
CREATE INDEX openscada_ae_events_idx_5l ON openscada_ae_events (lower(event_type));
CREATE INDEX openscada_ae_events_idx_6 ON openscada_ae_events (value_type);
CREATE INDEX openscada_ae_events_idx_7 ON openscada_ae_events (value_string);
CREATE INDEX openscada_ae_events_idx_7l ON openscada_ae_events (lower(value_string));
CREATE INDEX openscada_ae_events_idx_8 ON openscada_ae_events (value_integer);
CREATE INDEX openscada_ae_events_idx_9 ON openscada_ae_events (value_double);
CREATE INDEX openscada_ae_events_idx_10 ON openscada_ae_events (message);
CREATE INDEX openscada_ae_events_idx_10l ON openscada_ae_events (lower(message));
CREATE INDEX openscada_ae_events_idx_11 ON openscada_ae_events (message_code);
CREATE INDEX openscada_ae_events_idx_11l ON openscada_ae_events (lower(message_code));
CREATE INDEX openscada_ae_events_idx_12 ON openscada_ae_events (priority);
CREATE INDEX openscada_ae_events_idx_13 ON openscada_ae_events (source);
CREATE INDEX openscada_ae_events_idx_13l ON openscada_ae_events (lower(source));
CREATE INDEX openscada_ae_events_idx_14 ON openscada_ae_events (actor_name);
CREATE INDEX openscada_ae_events_idx_14l ON openscada_ae_events (lower(actor_name));
CREATE INDEX openscada_ae_events_idx_15 ON openscada_ae_events (actor_type);
CREATE INDEX openscada_ae_events_idx_15l ON openscada_ae_events (lower(actor_type));
CREATE INDEX openscada_ae_events_idx_16 ON openscada_ae_events (severity);
CREATE INDEX openscada_ae_events_idx_16l ON openscada_ae_events (lower(severity));
CREATE INDEX openscada_ae_events_idx_17 ON openscada_ae_events (replicated);

CREATE INDEX openscada_ae_events_attr_idx_1 ON openscada_ae_events_attr (id, key);
CREATE INDEX openscada_ae_events_attr_idx_2 ON openscada_ae_events_attr (value_type);
CREATE INDEX openscada_ae_events_attr_idx_3 ON openscada_ae_events_attr (value_string);
CREATE INDEX openscada_ae_events_attr_idx_3l ON openscada_ae_events_attr (lower(value_string));
CREATE INDEX openscada_ae_events_attr_idx_4 ON openscada_ae_events_attr (value_integer);
CREATE INDEX openscada_ae_events_attr_idx_5 ON openscada_ae_events_attr (value_double);

-- ALTER TABLE openscada_ae_events OWNER TO openscada;
-- ALTER TABLE openscada_ae_events_attr OWNER TO openscada;

-- for replication table ( blob mode )

CREATE TABLE openscada_ae_rep
(
  id                           CHAR(36) NOT NULL,
  entry_timestamp              TIMESTAMP,
  node_id                      VARCHAR(32),
  data                         BYTEA,
  CONSTRAINT openscada_ae_rep_pkey PRIMARY KEY ( id )	
);

CREATE INDEX openscada_ae_rep_idx_1 ON openscada_ae_rep (id);
CREATE INDEX openscada_ae_rep_idx_2 ON openscada_ae_rep (entry_timestamp);

-- users

CREATE TABLE os_groups
(
  group_id character varying(255) NOT NULL,
  CONSTRAINT os_groups_pkey PRIMARY KEY (group_id )
);
ALTER TABLE os_groups OWNER TO openscada;

CREATE TABLE os_group_assigns
(
  group_id character varying(255) NOT NULL,
  user_id character varying(255) NOT NULL,
  CONSTRAINT os_group_assigns_pkey PRIMARY KEY (group_id , user_id ),
  CONSTRAINT os_group_assigns_group_id_fkey FOREIGN KEY (group_id)
      REFERENCES os_groups (group_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
ALTER TABLE os_group_assigns OWNER TO openscada;

CREATE TABLE os_users
(
  user_id character varying(255) NOT NULL,
  password character varying(32),
  enabled boolean NOT NULL DEFAULT true,
  CONSTRAINT os_users_pkey PRIMARY KEY (user_id )
);
ALTER TABLE os_users OWNER TO openscada;

CREATE TABLE os_role_assigns
(
  actor_id character varying(255) NOT NULL,
  actor_type character varying(255) NOT NULL,
  role_name character varying(255) NOT NULL,
  CONSTRAINT os_role_assigns_pkey PRIMARY KEY (actor_id , actor_type , role_name )
);
ALTER TABLE os_role_assigns OWNER TO openscada;

