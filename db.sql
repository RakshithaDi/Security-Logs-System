USE [master]
GO
/****** Object:  Database [Securitylogsapp db]    Script Date: 1/19/2021 11:16:25 PM ******/
CREATE DATABASE [Securitylogsapp db]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Securitylogsapp db', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Securitylogsapp db.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Securitylogsapp db_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\Securitylogsapp db_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Securitylogsapp db] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Securitylogsapp db].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Securitylogsapp db] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET ARITHABORT OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Securitylogsapp db] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Securitylogsapp db] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET  DISABLE_BROKER 
GO
ALTER DATABASE [Securitylogsapp db] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Securitylogsapp db] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET RECOVERY FULL 
GO
ALTER DATABASE [Securitylogsapp db] SET  MULTI_USER 
GO
ALTER DATABASE [Securitylogsapp db] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Securitylogsapp db] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Securitylogsapp db] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Securitylogsapp db] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Securitylogsapp db] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Securitylogsapp db] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Securitylogsapp db', N'ON'
GO
ALTER DATABASE [Securitylogsapp db] SET QUERY_STORE = OFF
GO
USE [Securitylogsapp db]
GO
/****** Object:  Table [dbo].[admin]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admin](
	[Name] [varchar](20) NULL,
	[Password] [varchar](15) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[found]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[found](
	[id] [int] NULL,
	[itemid] [varchar](10) NULL,
	[itemdsc] [text] NULL,
	[foundplace] [text] NULL,
	[founddate] [date] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[itemowner]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[itemowner](
	[itemid] [varchar](10) NULL,
	[ownerid] [int] NULL,
	[owndate] [date] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[lost]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[lost](
	[id] [int] NULL,
	[itemid] [varchar](10) NULL,
	[itemdsc] [text] NULL,
	[place] [text] NULL,
	[date] [date] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[noidissued]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[noidissued](
	[NIC] [varchar](10) NOT NULL,
	[Name] [varchar](20) NULL,
	[CheckInDate] [date] NULL,
	[CheckInTime] [time](7) NULL,
	[CheckOutDate] [date] NULL,
	[CheckOutTime] [time](7) NULL,
 CONSTRAINT [PK_noidissued] PRIMARY KEY CLUSTERED 
(
	[NIC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[parking]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[parking](
	[NIC] [varchar](12) NOT NULL,
	[VehicleNumberPlate] [varchar](20) NULL,
	[ParkingSpotNo] [varchar](10) NULL,
	[CheckInTime] [time](7) NULL,
	[CheckInDate] [date] NULL,
	[CheckOutTime] [time](7) NULL,
	[CheckOutDate] [date] NULL,
	[PaymentFee] [varchar](10) NULL,
 CONSTRAINT [PK_parking] PRIMARY KEY CLUSTERED 
(
	[NIC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[visitors]    Script Date: 1/19/2021 11:16:25 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[visitors](
	[Name] [varchar](20) NULL,
	[NIC] [varchar](12) NULL,
	[Date] [date] NULL,
	[Time] [time](7) NULL,
	[Purpose] [text] NULL,
	[Inventory] [text] NULL,
	[PhoneNo] [int] NULL,
	[CheckOutTime] [time](7) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
USE [master]
GO
ALTER DATABASE [Securitylogsapp db] SET  READ_WRITE 
GO
