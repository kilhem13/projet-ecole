-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 07 juin 2019 à 19:22
-- Version du serveur :  5.7.14-log
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bdd_gestion`
--

-- --------------------------------------------------------

--
-- Structure de la table `anneescolaire`
--

DROP TABLE IF EXISTS `anneescolaire`;
CREATE TABLE IF NOT EXISTS `anneescolaire` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `bulletin`
--

DROP TABLE IF EXISTS `bulletin`;
CREATE TABLE IF NOT EXISTS `bulletin` (
  `id` int(11) NOT NULL,
  `appreciation` varchar(255) DEFAULT NULL,
  `trimestre_id` int(11) DEFAULT NULL,
  `inscription_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `trimestre_id` (`trimestre_id`),
  KEY `inscription_id` (`inscription_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `bulletin`
--

INSERT INTO `bulletin` (`id`, `appreciation`, `trimestre_id`, `inscription_id`) VALUES
(1, 'Bien', 1, 1),
(2, 'Bien', 1, 2),
(3, 'Très Bien', 1, 3);

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `classe`;
CREATE TABLE IF NOT EXISTS `classe` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `ecole_id` int(11) DEFAULT NULL,
  `niveau_id` int(11) DEFAULT NULL,
  `anneescolaire_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `anneescolaire_id` (`anneescolaire_id`),
  KEY `niveauid` (`niveau_id`),
  KEY `ecole_id` (`ecole_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id`, `nom`, `ecole_id`, `niveau_id`, `anneescolaire_id`) VALUES
(1, 'CP-1', 1, 1, 2017),
(2, 'CE1-1', 1, 1, 2018),
(3, 'CP-2', 2, 1, 2017);

-- --------------------------------------------------------

--
-- Structure de la table `detailbulletin`
--

DROP TABLE IF EXISTS `detailbulletin`;
CREATE TABLE IF NOT EXISTS `detailbulletin` (
  `id` int(11) NOT NULL,
  `appreciation` varchar(255) DEFAULT NULL,
  `bulletin_id` int(11) DEFAULT NULL,
  `coef` int(11) DEFAULT NULL,
  `enseignement_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bulletin_id` (`bulletin_id`),
  KEY `enseignement_id` (`enseignement_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `detailbulletin`
--

INSERT INTO `detailbulletin` (`id`, `appreciation`, `bulletin_id`, `coef`, `enseignement_id`) VALUES
(1, 'Très Bien', 1, 1, 1),
(2, 'Très Bien', 2, 1, 1),
(3, 'Moyen', 3, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `discipline`
--

DROP TABLE IF EXISTS `discipline`;
CREATE TABLE IF NOT EXISTS `discipline` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `discipline`
--

INSERT INTO `discipline` (`id`, `nom`) VALUES
(1, 'Francais'),
(2, 'Physique'),
(3, 'Histoire');

-- --------------------------------------------------------

--
-- Structure de la table `ecole`
--

DROP TABLE IF EXISTS `ecole`;
CREATE TABLE IF NOT EXISTS `ecole` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ecole`
--

INSERT INTO `ecole` (`id`, `nom`) VALUES
(1, 'Ecole1'),
(2, 'Ecole2');

-- --------------------------------------------------------

--
-- Structure de la table `enseignement`
--

DROP TABLE IF EXISTS `enseignement`;
CREATE TABLE IF NOT EXISTS `enseignement` (
  `id` int(11) NOT NULL,
  `classe_id` int(11) DEFAULT NULL,
  `discipline_id` int(11) DEFAULT NULL,
  `personne_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classe_id` (`classe_id`),
  KEY `discipline_id` (`discipline_id`),
  KEY `personne_id` (`personne_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `enseignement`
--

INSERT INTO `enseignement` (`id`, `classe_id`, `discipline_id`, `personne_id`) VALUES
(1, 1, 1, 10),
(2, 1, 2, 11),
(3, 2, 1, 10),
(4, 2, 2, 11),
(5, 3, 1, 10),
(6, 3, 2, 11),
(7, 5, 1, 10),
(8, 5, 2, 11),
(9, 4, 3, 12),
(10, 4, 2, 10),
(11, 6, 3, 12),
(12, 6, 2, 10);

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
CREATE TABLE IF NOT EXISTS `evaluation` (
  `id` int(11) NOT NULL,
  `appreciation` varchar(255) DEFAULT NULL,
  `note` int(11) DEFAULT NULL,
  `coef` int(11) DEFAULT NULL,
  `detailbulletin_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `detailbulletin_id` (`detailbulletin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `evaluation`
--

INSERT INTO `evaluation` (`id`, `appreciation`, `note`, `coef`, `detailbulletin_id`) VALUES
(1, 'Bof', 7, 4, 1),
(2, 'Bof', 10, 4, 2);

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `id` int(11) NOT NULL,
  `classe_id` int(11) DEFAULT NULL,
  `personne_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `classe_id` (`classe_id`),
  KEY `personne_id` (`personne_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `inscription`
--

INSERT INTO `inscription` (`id`, `classe_id`, `personne_id`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 3);

-- --------------------------------------------------------

--
-- Structure de la table `niveau`
--

DROP TABLE IF EXISTS `niveau`;
CREATE TABLE IF NOT EXISTS `niveau` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

DROP TABLE IF EXISTS `personne`;
CREATE TABLE IF NOT EXISTS `personne` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `personne`
--

INSERT INTO `personne` (`id`, `nom`, `prenom`, `type`) VALUES
(1, 'Dupond', 'Pierre', 1),
(2, 'Polo', 'Hugo', 1),
(3, 'Capot', 'Julie', 1),
(10, 'Busca', 'Jean-Michel', 2),
(11, 'Segado', 'Jean-Pierre', 2),
(12, 'Hina', 'Manolo', 2),
(13, 'Lili', 'Maurice', 1),
(14, 'Peter', 'Marc', 1);

-- --------------------------------------------------------

--
-- Structure de la table `trimestre`
--

DROP TABLE IF EXISTS `trimestre`;
CREATE TABLE IF NOT EXISTS `trimestre` (
  `id` int(11) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `debut` varchar(255) DEFAULT NULL,
  `fin` varchar(255) DEFAULT NULL,
  `aneescolaire_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `aneescolaire_id` (`aneescolaire_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
