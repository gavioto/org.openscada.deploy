%define _bindir /usr/bin
%define _docdir /usr/share/doc/%{name}
%define _perllibdir /usr/share/perl5
%define version 1.2.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.bin
Summary:   openSCADA bin
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: org.eclipse.scada
Requires: org.openscada.lib
Requires: org.openscada.configuration
Requires: jakarta-commons-daemon-jsvc
Requires: rsync
Requires: openssh-clients
Requires: perl

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
%attr(755,root,root) %{_bindir}/osDriverExporter
%attr(755,root,root) %{_bindir}/osFunctions
%attr(755,root,root) %{_bindir}/osService
%attr(755,root,root) %{_bindir}/hds-replicate-once
%dir %{_perllibdir}/openSCADA
%attr(644,root,root) %{_perllibdir}/openSCADA/Base.pm
%attr(644,root,root) %{_perllibdir}/openSCADA/Application.pm
%attr(644,root,root) %{_perllibdir}/openSCADA/JavaApplication.pm
%attr(644,root,root) %{_docdir}/hds.pull.conf.sample

%changelog
* Tue Aug 20 2013 jens.reimann@ibh-systems.com 1.2.0
- Fix permissions for bin files
* Tue Jul 31 2012 jens.reimann@th4-systems.com 1.0.0
- Initial version
