-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.55
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1045`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1045`
--

CREATE TABLE `identitas_1045` (
  `id` bigint(20) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `umur` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1045`
--

CREATE TABLE `ipk_1045` (
  `id` bigint(20) NOT NULL,
  `ipk` varchar(255) NOT NULL,
  `ips` varchar(100) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `identitas_1045_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1045`
--
ALTER TABLE `identitas_1045`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ipk_1045`
--
ALTER TABLE `ipk_1045`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKf2py4rtikfer3tpfmslb4b4yj` (`identitas_1045_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1045`
--
ALTER TABLE `identitas_1045`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `ipk_1045`
--
ALTER TABLE `ipk_1045`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1045`
--
ALTER TABLE `ipk_1045`
  ADD CONSTRAINT `FKf2py4rtikfer3tpfmslb4b4yj` FOREIGN KEY (`identitas_1045_id`) REFERENCES `identitas_1045` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
