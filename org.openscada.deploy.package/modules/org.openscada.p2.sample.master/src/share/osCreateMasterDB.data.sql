-- users

insert into os_groups ( group_id ) values ( 'openscada' );
insert into os_groups ( group_id ) values ( 'admin' );

-- user: admin/admin

insert into os_users ( user_id, password, enabled ) values ( 'admin', md5('admin'), true );
insert into os_users ( user_id, password, enabled ) values ( 'openscada', md5('openscada'), true );

insert into os_group_assigns ( user_id, group_id ) values ( 'openscada', 'admin' );
insert into os_group_assigns ( user_id, group_id ) values ( 'admin', 'admin' );

insert into os_role_assigns
	( actor_id, actor_type, role_name )
	values
	( 'openscada', 'GROUP', 'USER' );
	
insert into os_role_assigns
	( actor_id, actor_type, role_name )
	values
	( 'openscada', 'GROUP', 'OPERATOR' );
	
insert into os_role_assigns
	( actor_id, actor_type, role_name )
	values
	( 'admin', 'GROUP', 'ADMIN' );