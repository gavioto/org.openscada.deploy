#
# openSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define _bindir /usr/bin
%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define _profiledir %_datadir/openscada/profiles
%define version 1.0.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      p2.profiles
Summary:   P2 profiles for openSCADA
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <info@th4-systems.com>
Group:     Applications/System
Source0:   p2.profiles-%{version}.tar.gz
Prereq: /sbin/ldconfig
BuildRoot: %{buildroot}

%description

%prep
rm -Rf p2.profiles
mkdir p2.profiles
cd p2.profiles
tar xzf %_sourcedir/p2.profiles-%{version}.tar.gz
cd ..

%build

%install
install -d %buildroot/%_profiledir
install p2.profiles/*.profile.xml %buildroot/%_profiledir
for i in dave master; do
	install -d %buildroot/%_profiledir/$i
	install p2.profiles/$i/* %buildroot/%_profiledir/$i
done

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%dir %_profiledir
%_profiledir/*.profile.xml
%dir %_profiledir/master
%_profiledir/master/*
%dir %_profiledir/dave
%_profiledir/dave/*

%changelog
* Wed Feb  8 2012 - jens.reimann@th4-systems.com
- Adding *.profile.xml

* Thu Dec  9 2010 - jens.reimann@th4-systems.com
- Initial version