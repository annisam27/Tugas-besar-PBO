-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2019 at 06:12 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `daftar2`
--

CREATE TABLE `daftar2` (
  `Username` varchar(10) NOT NULL,
  `Password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar2`
--

INSERT INTO `daftar2` (`Username`, `Password`) VALUES
('annisa', '14117046'),
('hafid', '14117030'),
('nurul', '14117071');

-- --------------------------------------------------------

--
-- Table structure for table `daftaradmin`
--

CREATE TABLE `daftaradmin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftaradmin`
--

INSERT INTO `daftaradmin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `datarruangan`
--

CREATE TABLE `datarruangan` (
  `idruangan` varchar(10) NOT NULL,
  `namaruangan` varchar(10) NOT NULL,
  `lokasi` varchar(20) NOT NULL,
  `keterangan` varchar(30) NOT NULL,
  `statusruangan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datarruangan`
--

INSERT INTO `datarruangan` (`idruangan`, `namaruangan`, `lokasi`, `keterangan`, `statusruangan`) VALUES
('C102', 'AULA', 'Gedung C', 'Kapasitas 200 orang, full AC', 'dipinjam'),
('D103', 'LAB PRODI', 'Gedung D', 'Tersedia 50 komputer, full AC', 'kosong'),
('E005', 'Ruang KM ', 'Gedung E', 'tersedia proyektor,ac', 'dipinjam'),
('E301', 'Aula', 'Gedung E', 'kapasitas 100 orang', 'kosong');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `idpeminjam` varchar(10) NOT NULL,
  `namapeminjam` varchar(20) NOT NULL,
  `tanggalpinjam` date NOT NULL,
  `tanggalkembali` date NOT NULL,
  `idruangan` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peminjaman`
--

INSERT INTO `peminjaman` (`idpeminjam`, `namapeminjam`, `tanggalpinjam`, `tanggalkembali`, `idruangan`, `status`) VALUES
('14117030', 'hafid', '2019-05-12', '2019-05-13', 'E005', 'sukses'),
('14117046', 'Annisa', '2019-05-04', '2019-05-05', 'D103', 'selesai'),
('14117071', 'Nurul', '2019-05-02', '2019-05-03', 'C102', 'diproses'),
('14117086', 'nurtias', '2019-05-01', '2019-05-02', 'C102', 'sukses');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `daftar2`
--
ALTER TABLE `daftar2`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `daftaradmin`
--
ALTER TABLE `daftaradmin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `datarruangan`
--
ALTER TABLE `datarruangan`
  ADD PRIMARY KEY (`idruangan`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`idpeminjam`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
