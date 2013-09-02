%define _bindir /usr/bin
%define _datadir /usr/share
%define version 4.3.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      p2director
Summary:   openSCADA bin
Version:   %{version}
Release:   %{qualifier}
License:   EPLv1
BuildArch: i386
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Prefix: /usr

%description

%prep
rm -Rf %{name}
tar xpzf %_sourcedir/%{name}_%{version}%{qualifier}.tar.gz

%build

%install
rm -rf $RPM_BUILD_ROOT
cd %{name}.i386
make DESTDIR=$RPM_BUILD_ROOT install
cd ..

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%defattr(-,root,root)
%attr(744,root,root) %{_bindir}/p2director
%{_datadir}/p2director/

%changelog
* Fri Aug 09 2013 - jens.reimann@ibh-systems.com
- Change to Eclipse version 4.3.0

* Mon Mar 04 2013 - ctron@dentrassi.de
- Change to Eclipse version 3.8.1

* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
