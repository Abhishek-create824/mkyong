--Data manipulation language
--password is 123456
INSERT INTO users(username,password,enabled) VALUES ('mkyong','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', true);
INSERT INTO users(username,password,enabled) VALUES ('alex','$2a$10$trT3.R/Nfey62eczbKEnueTcIbJXW.u1ffAo/XfyLpofwNDbEB86O', true);
INSERT INTO users(username,password,enabled) VALUES ('cesar','$2a$10$teJrCEnsxNT49ZpXU7n22O27aCGbVYYe/RG6/XxdWPJbOLZubLIi2', true);
INSERT INTO users(username,password,enabled) VALUES ('leone','$2a$10$BHG59UT6p7bgT6U2fQ/9wOyTIdejh4Rk1vWilvl4b6ysNPdhnViUS', false);
INSERT INTO users(username,password,enabled) VALUES ('leandro','$2a$10$W9oRWeFmOT0bByL5fmAceucetmEYFg2yzq3e50mcu.CO7rUDb/poG', false);
 
INSERT INTO user_roles (username, role) VALUES ('mkyong', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('mkyong', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('alex', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('cesar', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leone', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('leone', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('leandro', 'ROLE_USER');
