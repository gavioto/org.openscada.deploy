%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define _cfgdir /etc/openscada
%define version 1.0.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.configuration
Summary:   openSCADA configuration
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <jens.reimann@th4-systems.com>
Group:     Applications/System
Source0:   %{name}_%{version}.tar.gz
BuildRoot: %{buildroot}

%description

%prep
rm -Rf %{name}
tar xpzf %_sourcedir/%{name}_%{version}.tar.gz

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
