%define _profiledir /etc/profile.d
%define _defaultdir /etc/default
%define _datadir /usr/share
%define _jardir /usr/jar
%define _logdir /var/log
%define _cfgdir /etc/openscada
%define version 1.0.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada
Summary:   openSCADA base
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <jens.reimann@th4-systems.com>
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
%attr(744,root,root) %{_profiledir}/th4.sh
%config %{_defaultdir}/th4
%dir %{_jardir}
%dir %{_cfgdir}
%dir %{_logdir}/openscada
%dir %{_datadir}/openscada

%changelog
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
