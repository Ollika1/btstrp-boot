INSERT INTO `roles` (`role`) VALUES ('ROLE_USER');
INSERT INTO `roles` (`role`) VALUES ('ROLE_ADMIN');

INSERT INTO `users` (`name`, `lastname`, `email`, `age`) VALUES ('user',
                                                                 'sam', 'user@mail.ru', 19);
INSERT INTO `users` (`name`, `lastname`, `email`, `age`) VALUES ('admin','zz', 'admin@mail.ru', 36);

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (1, 1);
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (2, 1);
INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES (2, 2);

UPDATE `users`
SET password='$2a$12$ws5QO3VZ5CF.BuWxm5QWYOeWNK25Ipa8pIS2coDfpStR5QZmadPI6'
where name='user';

UPDATE `users`
SET password='$2a$12$ws5QO3VZ5CF.BuWxm5QWYOeWNK25Ipa8pIS2coDfpStR5QZmadPI6'
where name='admin';

#password = 1