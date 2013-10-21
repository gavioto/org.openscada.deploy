%define _cfgdir /etc/eclipsescada
%define version 1.2.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.configuration
Summary:   openSCADA configuration
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: org.openscada

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
%dir %_cfgdir/schema
%_cfgdir/schema/

%changelog
* Tue Aug 1 2012 - jens.reimann@th4-systems.com
- Initial version
