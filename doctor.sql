-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2022 at 03:23 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `doctorid` int(11) NOT NULL,
  `fname` varchar(30) DEFAULT NULL,
  `lname` varchar(30) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `pincode` varchar(10) DEFAULT NULL,
  `mobileno` varchar(10) DEFAULT NULL,
  `qualification` varchar(100) DEFAULT NULL,
  `designation` varchar(50) DEFAULT NULL,
  `specialization` varchar(20) DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('active','close'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`doctorid`, `fname`, `lname`, `address`, `pincode`, `mobileno`, `qualification`, `designation`, `specialization`, `currentstatus`) VALUES
(1, 'saad', 'khan', 'naveen nagar, bhopal', '462023', '7974****02', 'MD', 'cardiologist', 'heart diseases', 'active'),
(3, 'deepak', 'kumar', 'akbarpur', '462008', '54667', 'dnb', 'oncologist', 'onco surgeon', 'active'),
(8, 'shahzeb', 'khan', 'kohefiza', '462023', '4686989', 'mbbs', 'neurologit', 'neuro surgeon', 'Close');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`doctorid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
