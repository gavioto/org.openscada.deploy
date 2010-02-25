#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%k%%M%%S)

%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define version 0.15.0

Name:      openscada.p2.external
Summary:   The openscada external P2 repository
Version:   %{version}
Release:   %{qualifier}
License:   GPL
BuildArch: noarch
Vendor:    inavare GmbH <info@inavare.net>
Group:     Applications/System
Source0:   org.openscada.external-%{version}-p2repo.zip
Prereq: /sbin/ldconfig
Requires: openscada.p2

%description

%prep

%build

%install
install -d %buildroot/%_repodir
install ../SOURCES/org.openscada.external-0.15.0-p2repo.zip %buildroot/%_repodir/

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%_repodir/org.openscada.external-0.15.0-p2repo.zip

%changelog
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
