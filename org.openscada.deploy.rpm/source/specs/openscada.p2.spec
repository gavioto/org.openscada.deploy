#
# openSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define _bindir /usr/bin
%define _datadir /usr/share
%define _repodir %_datadir/openscada/p2
%define _logdir /var/log
%define version 1.1.0
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      openscada.p2
Summary:   The openSCADA P2 repository and deployment system
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  TH4 SYSTEMS GmbH <info@th4-systems.com>
Vendor:    TH4 SYSTEMS GmbH <info@th4-systems.com>
Group:     Applications/System
Source0:   org.openscada.p2-%{version}.tar.gz
Prereq: /sbin/ldconfig
Requires:	screen
BuildRoot: %{buildroot}
Prefix: %{_bindir}
Prefix: %{_repodir}
Prefix: %{_logdir}

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
install -d %buildroot/%_logdir/openscada
install openscada.p2/usr/bin/p2.*  %buildroot/%_bindir

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%dir %_repodir
%_bindir/p2.*
%dir %_logdir/openscada

%changelog
* Mon Jun 11 2012 - jens.reimann@th4-systems.net
- Make relocatable
* Tue Apr 12 2012 - jens.reimann@th4-systems.net
- Building for openSCADA 1.0.0
* Mon Nov 28 2011 - jens.reimann@th4-systems.net
- Building for openSCADA 0.18.0
* Wed Jul 13 2011 - jens.reimann@th4-systems.net
- Add requirement screen
- Add p2.autostart
* Thu Dec  9 2010 - jens.reimann@th4-systems.net
- Change to TH4 and remove profiles
* Fri May 28 2010 - jens.reimann@inavare.net
- Added profiledir
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
