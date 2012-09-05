
-- create user

create user openscada with password 'openscada';

-- create database

create database os_master_sample owner openscada;

-- grants

grant all privileges on database os_master_sample to openscada;