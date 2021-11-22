--
-- Création de la Base de Données `calcul_mental`
--
create database calcul_mental;

--
-- Structure de la table `resultat`
--

DROP TABLE IF EXISTS `resultat`;
CREATE TABLE IF NOT EXISTS `resultat` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `score` int(11) NOT NULL,
    `dateHeure` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
    `idUser` int(11) NOT NULL,
    PRIMARY KEY (`id`),
    KEY `idUser` (`idUser`)
    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

INSERT INTO `resultat` (`id`, `score`, `dateHeure`, `idUser`) VALUES
                                                                     (1, 3, '2021-11-22 20:26:36', 1),
                                                                     (2, 6, '2021-10-20 20:15:33', 1);

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `login` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    `bestscore` int(11) NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `login`, `password`, `bestscore`) VALUES
                                                                (1, 'antho', '123', 8),
                                                                (2, 'alexandre', '123', 10),
                                                                (3, 'sega2', '123', 2),
                                                                (4, 'sega00', '123', 0),
                                                                (5, 'sega1', '123', 1),
                                                                (6, 'sega0', '123', 0),
                                                                (7, 'sega3', '123', 3),
                                                                (8, 'sega4', '123', 4),
                                                                (9, 'sega5', '123', 5),
                                                                (10, 'sega6', '123', 6),
                                                                (11, 'sega7', '123', 7),
                                                                (12, 'sega8', '123', 8);