#
# OpenSCADA Spec File
#

%define qualifier %(date +%%Y%%m%%d%%k%%M%%S)

%define version 3.5.0

%define _datadir /usr/share
%define _bindir /usr/bin

Name:      p2director
Summary:   The Equinox P2 director
Version:   %{version}
Release:   %{qualifier}
License:   ECL
Packager:    inavare GmbH <info@inavare.net>
Group:     Applications/System
Source0:   p2director-linux.gtk.x86_64.zip
Prereq: /sbin/ldconfig

%description

%prep
rm -Rf p2director
unzip %_sourcedir/p2director-linux.gtk.x86_64.zip

%build

%install
mkdir -p %buildroot/%_datadir/
cp -a p2director %buildroot/%_datadir/

# Override p2director.ini since it comes broken from the P2 build
cp %_sourcedir/p2director.ini %buildroot/%_datadir/p2director

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
* Thu Feb 25 2010 - jens.reimann@inavare.net
- Initial version
