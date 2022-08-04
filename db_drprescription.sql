-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 03, 2022 at 10:34 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_drprescription`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_medicine`
--

CREATE TABLE `tbl_medicine` (
  `id` int(11) NOT NULL,
  `m_Id` varchar(255) NOT NULL,
  `m_Name` varchar(255) NOT NULL,
  `m_Type` varchar(255) NOT NULL,
  `company_Name` varchar(255) NOT NULL,
  `note` varchar(500) NOT NULL,
  `m_Advice` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_medicine`
--

INSERT INTO `tbl_medicine` (`id`, `m_Id`, `m_Name`, `m_Type`, `company_Name`, `note`, `m_Advice`) VALUES
(26, '1001', 'Napa', 'Tablet', 'Square', 'For Fever', ''),
(27, '1002', 'Boxol', 'Syrup', 'Square', 'For cough', ''),
(28, '1003', 'Toffen', 'Tablet', 'Beximco', 'For cough', ''),
(29, '1004', 'Bexicap', 'Other', 'Beximco', 'For asthma', ''),
(30, '1005', 'Antacid', 'Tablet', 'Square', 'For acidity', 'Should be away from smoking'),
(31, '1006', 'Tufnill', 'Tablet', 'Beximco', 'For Headache', ''),
(33, '1007', 'Ultrifin', 'Syrup', 'Ibne Sina', 'Vitamins', 'Avoid smoking.');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `id` int(11) NOT NULL,
  `p_Id` varchar(255) NOT NULL,
  `p_Name` varchar(255) NOT NULL,
  `p_Gender` varchar(255) NOT NULL,
  `p_Age` int(11) NOT NULL,
  `p_Gurdian` varchar(255) NOT NULL,
  `p_Address` varchar(255) NOT NULL,
  `p_Phone` varchar(255) NOT NULL,
  `p_Email` varchar(255) NOT NULL,
  `p_Mcomplaints` varchar(255) NOT NULL,
  `p_Ocomplaints` varchar(255) NOT NULL,
  `p_Blood` varchar(255) NOT NULL,
  `p_Status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`id`, `p_Id`, `p_Name`, `p_Gender`, `p_Age`, `p_Gurdian`, `p_Address`, `p_Phone`, `p_Email`, `p_Mcomplaints`, `p_Ocomplaints`, `p_Blood`, `p_Status`) VALUES
(9, '1001', 'Rakibul Islam', 'Male', 23, 'Md. Shaheb Miah', 'Dabra, Rangpur', '01792893899', 'rakibulislam@gmail.com', 'Fever', 'cough', 'AB+', 1),
(10, '1002', 'Fariya Richie', 'Female', 25, 'Khorshed Chowdhury', '01345990968', 'Rangpur', 'shohanuralom@gmail.com', 'Bone Pain', 'Fever', 'O+', 0),
(19, '1003', 'Tanzina Parvin', 'Female', 20, 'Abdur Rashid', '', '', '', 'Fever', 'Cough', 'B+', 1),
(20, '1004', 'Md Liton Mahbub', 'Male', 20, 'Sabur Ali', '01982938493', 'Natore', 'liton@gmail.com', 'Cough and Fever', 'Back Pain', 'AB+', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_prescription`
--

CREATE TABLE `tbl_prescription` (
  `id` int(11) NOT NULL,
  `patient_id` varchar(255) NOT NULL,
  `m_name` varchar(255) NOT NULL,
  `m_company` varchar(255) NOT NULL,
  `m_type` varchar(255) NOT NULL,
  `m_strength` varchar(255) NOT NULL,
  `m_dose` varchar(255) NOT NULL,
  `m_duration` varchar(255) NOT NULL,
  `m_instruction` varchar(255) NOT NULL,
  `m_advice` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_prescription`
--

INSERT INTO `tbl_prescription` (`id`, `patient_id`, `m_name`, `m_company`, `m_type`, `m_strength`, `m_dose`, `m_duration`, `m_instruction`, `m_advice`) VALUES
(1, '1001', 'Napa', 'Square', 'Tablet', '400', '1-1-1', '4 Days', 'Before Eating', 'Avoid Smoking'),
(9, '1002', 'Napa', 'Square', 'Tablet', '100', '1-1-1', '5 Days', 'After Eating', 'Take Regularly'),
(10, '1002', 'Antacid', 'Square', 'Tablet', '100', '1-1-1', '5 Days', 'Before Eating', 'Should be away from smoking'),
(12, '1001', 'Tufnill', 'Beximco', 'Tablet', '100', '1-1-1', '7 Days', 'After Eating', ''),
(13, '1003', 'Ultrifin', 'Ibne Sina', 'Syrup', '500', '1-1-1', '7 Days', 'After Eating', 'Avoid smoking.'),
(14, '1003', 'Napa', 'Square', 'Tablet', '100', '1-1-1', '7 Days', 'After Eating', ''),
(16, '1003', 'Antacid', 'Square', 'Tablet', '100', '1-1-1', '7 Days', 'Before Eating', 'Should be away from smoking'),
(18, '1001', 'Antacid', 'Square', 'Tablet', '100', '1-1-1', '4 Days', 'Before Eating', 'Should be away from smoking'),
(19, '1001', 'Ultrifin', 'Ibne Sina', 'Syrup', '500', '1-1-1', '6 Days', 'After Eating', 'Avoid smoking.');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_settings`
--

CREATE TABLE `tbl_settings` (
  `id` int(11) NOT NULL,
  `hospitalName` varchar(255) NOT NULL,
  `hospitalAddress` varchar(255) NOT NULL,
  `hospitalDistrict` varchar(255) NOT NULL,
  `doctorName` varchar(255) NOT NULL,
  `doctorDesignation` varchar(255) NOT NULL,
  `doctorQual1` varchar(255) NOT NULL,
  `doctorQual2` varchar(255) NOT NULL,
  `doctorTime` varchar(255) NOT NULL,
  `doctorPhone` varchar(255) NOT NULL,
  `doctorEmail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_settings`
--

INSERT INTO `tbl_settings` (`id`, `hospitalName`, `hospitalAddress`, `hospitalDistrict`, `doctorName`, `doctorDesignation`, `doctorQual1`, `doctorQual2`, `doctorTime`, `doctorPhone`, `doctorEmail`) VALUES
(4, 'Vision Diagostic Center', 'Shathibari 8/4, Rangpur Road', 'Rangpur', 'Dr Jahangir Alam Chowdhury', 'Medical Surgeon', 'MBBS - Dhaka Medical College and Hospital', 'BCS - Health', '6 am - 9 am And 4pm to 8pm ', '01929390298', 'jahangir.mbbs@gmail.com'),
(5, 'Vision Diagnostic Center', 'Shathibari 9/3, Rangpur Road', 'Rangpur', 'Dr. Md Jahangir Alam Chowdhury', 'Medical Surgeon', 'MBBS - Rangpur Medical College & Hospital', 'BCS - Health', '6 am to 9 am & 4 pm to 8 pm', '01717398790', 'jahangir.mbbs@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_medicine`
--
ALTER TABLE `tbl_medicine`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_prescription`
--
ALTER TABLE `tbl_prescription`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_settings`
--
ALTER TABLE `tbl_settings`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_medicine`
--
ALTER TABLE `tbl_medicine`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tbl_prescription`
--
ALTER TABLE `tbl_prescription`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `tbl_settings`
--
ALTER TABLE `tbl_settings`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
