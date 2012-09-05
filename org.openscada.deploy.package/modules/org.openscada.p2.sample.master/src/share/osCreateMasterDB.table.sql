
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

CREATE TABLE openscada_ae_events
(
  id character(36) NOT NULL,
  source_timestamp timestamp without time zone,
  entry_timestamp timestamp without time zone,
  instance_id character varying(32),
  monitor_type character varying(32),
  event_type character varying(32),
  value_type character varying(32),
  value_string character varying(4000),
  value_integer bigint,
  value_double double precision,
  message character varying(4000),
  message_code character varying(255),
  priority smallint,
  source character varying(255),
  actor_name character varying(128),
  actor_type character varying(32),
  CONSTRAINT openscada_ae_events_pkey PRIMARY KEY (id )
)
WITH (
  OIDS=FALSE
);
ALTER TABLE openscada_ae_events
  OWNER TO openscada;

CREATE INDEX openscada_ae_events_idx_1
  ON openscada_ae_events
  USING btree
  (source_timestamp );

CREATE INDEX openscada_ae_events_idx_10
  ON openscada_ae_events
  USING btree
  (message COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_10l
  ON openscada_ae_events
  USING btree
  (lower(message::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_11
  ON openscada_ae_events
  USING btree
  (message_code COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_11l
  ON openscada_ae_events
  USING btree
  (lower(message_code::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_12
  ON openscada_ae_events
  USING btree
  (priority );

CREATE INDEX openscada_ae_events_idx_13
  ON openscada_ae_events
  USING btree
  (source COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_13l
  ON openscada_ae_events
  USING btree
  (lower(source::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_14
  ON openscada_ae_events
  USING btree
  (actor_name COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_14l
  ON openscada_ae_events
  USING btree
  (lower(actor_name::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_15
  ON openscada_ae_events
  USING btree
  (actor_type COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_15l
  ON openscada_ae_events
  USING btree
  (lower(actor_type::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_1d
  ON openscada_ae_events
  USING btree
  (source_timestamp  DESC);

CREATE INDEX openscada_ae_events_idx_2
  ON openscada_ae_events
  USING btree
  (entry_timestamp );

CREATE INDEX openscada_ae_events_idx_2d
  ON openscada_ae_events
  USING btree
  (entry_timestamp  DESC);

CREATE INDEX openscada_ae_events_idx_3
  ON openscada_ae_events
  USING btree
  (instance_id COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_4
  ON openscada_ae_events
  USING btree
  (monitor_type COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_4l
  ON openscada_ae_events
  USING btree
  (lower(monitor_type::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_5
  ON openscada_ae_events
  USING btree
  (event_type COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_5l
  ON openscada_ae_events
  USING btree
  (lower(event_type::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_6
  ON openscada_ae_events
  USING btree
  (value_type COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_7
  ON openscada_ae_events
  USING btree
  (value_string COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_7l
  ON openscada_ae_events
  USING btree
  (lower(value_string::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_idx_8
  ON openscada_ae_events
  USING btree
  (value_integer );

CREATE INDEX openscada_ae_events_idx_9
  ON openscada_ae_events
  USING btree
  (value_double );

CREATE TABLE openscada_ae_events_attr
(
  id character(36) NOT NULL,
  key character varying(64) NOT NULL,
  value_type character varying(32),
  value_string character varying(4000),
  value_integer bigint,
  value_double double precision,
  CONSTRAINT openscada_ae_events_attr_pkey PRIMARY KEY (id , key ),
  CONSTRAINT openscada_ae_events_attr_id_fkey FOREIGN KEY (id)
      REFERENCES openscada_ae_events (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE openscada_ae_events_attr
  OWNER TO openscada;

CREATE INDEX openscada_ae_events_attr_idx_1
  ON openscada_ae_events_attr
  USING btree
  (id COLLATE pg_catalog."default" , key COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_attr_idx_2
  ON openscada_ae_events_attr
  USING btree
  (value_type COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_attr_idx_3
  ON openscada_ae_events_attr
  USING btree
  (value_string COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_attr_idx_3l
  ON openscada_ae_events_attr
  USING btree
  (lower(value_string::text) COLLATE pg_catalog."default" );

CREATE INDEX openscada_ae_events_attr_idx_4
  ON openscada_ae_events_attr
  USING btree
  (value_integer );

CREATE INDEX openscada_ae_events_attr_idx_5
  ON openscada_ae_events_attr
  USING btree
  (value_double );


