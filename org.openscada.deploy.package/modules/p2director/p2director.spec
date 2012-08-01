%define _bindir /usr/bin
%define _datadir /usr/share
%define version 3.7.2
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      p2director
Summary:   openSCADA bin
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: x86_64
Packager:  TH4 SYSTEMS GmbH <jens.reimann@th4-systems.com>
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
cd %{name}
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
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
