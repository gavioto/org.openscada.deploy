#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%k%%M%%S)

%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define version 0.15.0

Name:      openscada.p2
Summary:   The openscada P2 repository and product system
Version:   %{version}
Release:   %{qualifier}
License:   GPL
BuildArch: noarch
Vendor:    inavare GmbH <info@inavare.net>
Group:     Applications/System
Source0:   org.openscada.p2-%{version}.tar.gz
Prereq: /sbin/ldconfig

%description

%prep
#%setup

%build

%install
install -d %buildroot/%_repodir

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%dir %_repodir

%changelog
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
