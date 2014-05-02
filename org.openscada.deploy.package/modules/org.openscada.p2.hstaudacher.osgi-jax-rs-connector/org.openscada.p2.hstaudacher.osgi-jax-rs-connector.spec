%define _datadir /usr/share
%define version 3.1.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.p2.hstaudacher.osgi-jax-rs-connector
Summary:   openSCADA P2 package wrapper for OSGi - JAX-RS Connector 3.1.0
Version:   %{version}
Release:   %{qualifier}
License:   EPL
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: org.eclipse.scada.p2

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
%attr(744,root,root) %{_datadir}/eclipsescada/p2/*

%changelog
* Fri Nov 29 2013 - jens.reimann@ibh-systems.com
- Initial version
