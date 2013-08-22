%define _profiledir /etc/profile.d
%define _defaultdir /etc/default
%define _datadir /usr/share
%define _jardir /usr/jar
%define _logdir /var/log
%define _rundir /var/run
%define _cfgdir /etc/openscada
%define version 1.2.0
%define buildroot %{_topdir}/%{name}-%{version}-root
%define os_user openscada

Name:      org.openscada
Summary:   openSCADA base
Version:   %{version}
Release:   %{qualifier}
License:   LGPLv3
BuildArch: noarch
Packager:  openSCADA.org <ctron@dentrassi.de>
Group:     Applications/System
Source0:   %{name}_%{version}%{qualifier}.tar.gz
BuildRoot: %{buildroot}
Requires: java7
# for adding the user with "adduser"
Requires: shadow-utils
# for the "getent" command
Requires: glibc-common

%description

%prep
rm -Rf %{name}
tar xpzf %_sourcedir/%{name}_%{version}%{qualifier}.tar.gz

%build

%install
rm -rf $RPM_BUILD_ROOT
cd %{name}
make TYPE=centos DESTDIR=$RPM_BUILD_ROOT install
cd ..

%clean
[ ${RPM_BUILD_ROOT} != "/" ] && rm -rf ${RPM_BUILD_ROOT}

%post
if ! getent passwd "%{os_user}" >/dev/null; then
	adduser --system --user-group --home "/var/lib/%{os_user}" "%{os_user}" --comment "openSCADA daemon user"
fi
mkdir -p "/var/lib/%{os_user}"
chown -R "%{os_user}:%{os_user}" "/var/lib/%{os_user}"

%postun
if [ "$1" -eq "0" ]; then
	# true uninstall
	if which userdel >/dev/null 2>&1; then
		userdel "%{os_user}" > /dev/null || true
	fi
	groupdel "%{os_user}" > /dev/null || true
fi
		


%files
%defattr(-,root,root)
%attr(744,root,root) %{_profiledir}/openscada.sh
%config %{_defaultdir}/openscada
%dir %{_jardir}
%dir %{_cfgdir}
%dir %attr(775,root,openscada) %{_logdir}/openscada
%dir %attr(775,root,openscada) %{_rundir}/openscada
%dir %{_datadir}/openscada

%changelog
* Tue Aug 20 2013 - jens.reimann@ibh-systems.com
- Adding user creation for RPM
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
