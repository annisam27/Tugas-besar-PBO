-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2019 at 06:27 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `keloladataruangan` varchar(15) NOT NULL,
  `kelolapinjaman` varchar(15) NOT NULL,
  `laporan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `daftar2`
--

CREATE TABLE `daftar2` (
  `Username` varchar(15) NOT NULL,
  `Password` varchar(10) NOT NULL,
  `kategori` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar2`
--

INSERT INTO `daftar2` (`Username`, `Password`, `kategori`) VALUES
('admin', 'admin', ''),
('14117071', '313131', '');

-- --------------------------------------------------------

--
-- Table structure for table `datarruangan`
--

CREATE TABLE `datarruangan` (
  `idruangan` varchar(15) NOT NULL,
  `namaruangan` varchar(15) NOT NULL,
  `lokasi` varchar(25) NOT NULL,
  `keterangan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datarruangan`
--

INSERT INTO `datarruangan` (`idruangan`, `namaruangan`, `lokasi`, `keterangan`) VALUES
('12', 'Aulaa', 'Gedung E', 'Meminjam'),
('12', 'Aulaa', 'Gedung E', 'Meminjam');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idpeminjam` varchar(15) NOT NULL,
  `namapeminjam` varchar(25) NOT NULL,
  `tanggalpinjam` int(10) NOT NULL,
  `tanggalkembali` int(10) NOT NULL,
  `idruang` varchar(15) NOT NULL,
  `namaruang` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
