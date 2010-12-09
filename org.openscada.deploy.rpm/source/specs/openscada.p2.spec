#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define _bindir /usr/bin
%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define version 0.16.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      openscada.p2
Summary:   The openscada P2 repository and product system
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <info@th4-systems.com>
Vendor:    TH4 SYSTEMS GmbH <info@th4-systems.com>
Group:     Applications/System
Source0:   org.openscada.p2-%{version}.tar.gz
Prereq: /sbin/ldconfig
BuildRoot: %{buildroot}

%description

%prep
rm -Rf openscada.p2
mkdir openscada.p2
cd openscada.p2
tar xzf %_sourcedir/org.openscada.p2-%{version}.tar.gz
cd ..

%build

%install
install -d %buildroot/%_repodir
install -d %buildroot/%_bindir
install openscada.p2/usr/bin/p2.*  %buildroot/%_bindir

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%dir %_repodir
%_bindir/p2.*

%changelog
* Thu Dec  9 2010 - jens.reimann@th4-systems.net
- Change to TH4 and remove profiles
* Fri May 28 2010 - jens.reimann@inavare.net
- Added profiledir
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
