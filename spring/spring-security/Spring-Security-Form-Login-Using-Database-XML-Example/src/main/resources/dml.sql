--Data manipulation language
INSERT INTO users(username,password,enabled) VALUES ('mkyong','123456', true);
INSERT INTO users(username,password,enabled) VALUES ('alex','123456', true);
INSERT INTO users(username,password,enabled) VALUES ('cesar','12345', true);
INSERT INTO users(username,password,enabled) VALUES ('leone','12345', false);
INSERT INTO users(username,password,enabled) VALUES ('leandro','12345', false);
 
INSERT INTO user_roles (username, role) VALUES ('mkyong', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('mkyong', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('alex', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leone', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('leone', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leandro', 'ROLE_USER');
