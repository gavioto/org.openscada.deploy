%define _jardir /usr/jar
%define version 1.2.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.lib.ext
Summary:   openSCADA external lib
Version:   %{version}
Release:   %{qualifier}
License:   various
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: org.eclipse.scada
Requires: org.openscada.bin

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
%attr(644,root,root) %{_jardir}/*.jar

%changelog
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
