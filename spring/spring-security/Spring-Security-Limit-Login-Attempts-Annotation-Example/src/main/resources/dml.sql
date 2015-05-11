--Data manipulation language
INSERT INTO users(username, password, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired) VALUES ('mkyong',  '123456', true,  true, true, true);
INSERT INTO users(username, password, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired) VALUES ('alex',	  '123456', true,  true, true, true);
INSERT INTO users(username, password, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired) VALUES ('cesar',	  '12345',  true,  true, true, true);
INSERT INTO users(username, password, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired) VALUES ('leone',	  '12345',  false, true, true, true);
INSERT INTO users(username, password, enabled, accountNonExpired, accountNonLocked, credentialsNonExpired) VALUES ('leandro', '12345',  false, true, true, true);
 
INSERT INTO user_roles (username, role) VALUES ('mkyong',  'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('mkyong',  'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('alex',    'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar',   'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar',   'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leone',   'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('leone',   'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leandro', 'ROLE_USER');
