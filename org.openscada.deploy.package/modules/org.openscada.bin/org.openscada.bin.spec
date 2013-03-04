%define _bindir /usr/bin
%define _docdir /usr/share/doc/%{name}
%define _perllibdir /usr/lib/perl5
%define version 1.0.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      org.openscada.bin
Summary:   openSCADA bin
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <jens.reimann@th4-systems.com>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: org.openscada
Requires: org.openscada.lib
Requires: org.openscada.configuration

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
%attr(744,root,root) %{_bindir}/osDriverExporter
%attr(744,root,root) %{_bindir}/osFunctions
%attr(744,root,root) %{_bindir}/osService
%attr(744,root,root) %{_bindir}/hds-replicate-once
%dir %{_perllibdir}/openSCADA
%attr(644,root,root) %{_perllibdir}/openSCADA/Base.pm
%attr(644,root,root) %{_perllibdir}/openSCADA/Application.pm
%attr(644,root,root) %{_perllibdir}/openSCADA/JavaApplication.pm
%attr(644,root,root) %{_docdir}/hds.pull.conf.sample

%changelog
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
