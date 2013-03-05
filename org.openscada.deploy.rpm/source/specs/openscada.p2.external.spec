#
# openSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define version 1.1.0

Name:      openscada.p2.external
Summary:   The openSCADA external P2 repository
Version:   %{version}
Release:   %{qualifier}
License:   LGPL
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <info@th4-systems.com>
Vendor:    TH4 SYSTEMS GmbH <info@th4-systems.com>
Group:     Applications/System
Source0:   org.openscada.external-%{version}-p2repo.zip
Prereq: /sbin/ldconfig
Requires: openscada.p2
Prefix: %{_repodir}

%description

%prep

%build

%install
install -d %buildroot/%_repodir
install -m 0644 ../SOURCES/org.openscada.external-1.0.0-p2repo.zip %buildroot/%_repodir/

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%_repodir/org.openscada.external-1.0.0-p2repo.zip

%changelog
* Mon Jun 11 2012 - jens.reimann@th4-systems.net
- Make relocatable
* Tue Apr 12 2012 - jens.reimann@th4-systems.net
- Change to version 1.0
* Thu Dec  9 2010 - jens.reimann@th4-systems.net
- Change to TH4
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
