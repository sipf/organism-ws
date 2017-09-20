
INSERT INTO TYPE (ID, NAME) VALUES (nextval('type_sequence'), 'Pays');
INSERT INTO TYPE (ID, NAME) VALUES (nextval('type_sequence'), 'Etat');
INSERT INTO TYPE (ID, NAME) VALUES (nextval('type_sequence'), 'Commune');
INSERT INTO TYPE (ID, NAME) VALUES (nextval('type_sequence'), 'Etablissement public');
INSERT INTO TYPE (ID, NAME) VALUES (nextval('type_sequence'), 'Association');

INSERT INTO STATUT (ID, NAME) VALUES (nextval('statut_sequence'), 'actif');
INSERT INTO STATUT (ID, NAME) VALUES (nextval('statut_sequence'), 'inactif');

INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'facebook', 'https://bin.gov.pf/public/logo/facebook.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'twitter', 'https://bin.gov.pf/public/logo/twitter.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'google+', 'https://bin.gov.pf/public/logo/googleplus.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'github', 'https://bin.gov.pf/public/logo/github.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'gitlab', 'https://bin.gov.pf/public/logo/gitlab.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'instagram', 'https://bin.gov.pf/public/logo/instagram.svg');
INSERT INTO SOCIAL_NETWORK (ID, NAME, LOGO) VALUES (nextval('social_network_sequence'), 'youtube', 'https://bin.gov.pf/public/logo/youtube.svg');
