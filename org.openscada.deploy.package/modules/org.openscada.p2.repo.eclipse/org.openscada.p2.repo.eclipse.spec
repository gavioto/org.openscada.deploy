%define _datadir /usr/share
%define version 1.1.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.p2.repo.eclipse
Summary:   openSCADA P2 main repositories
Version:   %{version}
Release:   %{qualifier}
License:   various
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
cd ..

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%defattr(-,root,root)
%attr(744,root,root) %{_datadir}/openscada/p2/*

%changelog
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
