%define _datadir /usr/share
%define _bindir /usr/bin
%define version 1.1.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.p2.sample.master
Summary:   openSCADA Master sample installation
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}

%description

%prep
rm -Rf %{name}
tar xpzf %_sourcedir/%{name}_%{version}%{qualifier}.tar.gz

%build

%install
rm -rf $RPM_BUILD_ROOT
cd %{name}
make DESTDIR=$RPM_BUILD_ROOT install

# remove upstart files for redhat based distributions
rm "$RPM_BUILD_ROOT/etc/init/"*.conf
rmdir "$RPM_BUILD_ROOT/etc/init/"

cd ..

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%defattr(-,root,root)
%attr(755,root,root) %{_bindir}/osCreateMasterDB
%attr(644,root,root) %{_datadir}/openscada/profiles/*
%attr(644,root,root) %{_datadir}/openscada/samples/*

%changelog
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
