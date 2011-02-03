#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%H%%M%%S)

%define version 3.6.1

%define _datadir /usr/share
%define _bindir /usr/bin
%define buildroot %{_topdir}/%{name}-%{version}-root

Name:      p2director
Summary:   The Equinox P2 director
Version:   %{version}
Release:   %{qualifier}
License:   ECL
Packager:  TH4 SYSTEMS GmbH <jens.reimann@th4-systems.com>
Group:     Applications/System
Source0:   p2director-linux.gtk.x86_64.zip
Prereq: /sbin/ldconfig
BuildRoot: %{buildroot}

%description

%prep
rm -Rf p2director
unzip %_sourcedir/p2director-linux.gtk.x86_64.zip

%build

%install
mkdir -p %buildroot/%_datadir/
cp -a p2director %buildroot/%_datadir/

mkdir -p %buildroot/%_bindir/
ln -s ../share/p2director/p2director %buildroot/%_bindir/p2director

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post

%postun

%files
%dir %_datadir/p2director
%_datadir/p2director
%_bindir/p2director

%changelog
* Thu Dec  9 2010 - jens.reimann@th4-systems.net
- Change to TH4
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
