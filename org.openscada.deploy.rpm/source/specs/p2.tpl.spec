#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%k%%M%%S)

%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define version ___VERSION___

Name:      ___NAME___
Summary:   Wrapping the P2 repository ___NAME___
Version:   %{version}
Release:   %{qualifier}
License:   Other
BuildArch: noarch
Packager:  inavare GmbH <info@inavare.net>
Group:     Applications/System
Source0:   ___FILE___
Prereq: /sbin/ldconfig
Requires: openscada.p2

%description

%prep

%build

%install
install -d %buildroot/%_repodir
install ../SOURCES/___FILE___ %buildroot/%_repodir/

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%_repodir/___FILE___

%changelog
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
