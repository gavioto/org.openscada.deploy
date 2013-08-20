%define _profiledir /etc/profile.d
%define _defaultdir /etc/default
%define _datadir /usr/share
%define _jardir /usr/jar
%define _logdir /var/log
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
if ! getent passwd "%{os_user}" >/dev/null; then
adduser --system --group --home "/var/lib/%{os_user}" "%{os_user}" \
    --quiet --gecos "openSCADA daemon user"
fi
mkdir -p "/var/lib/%{os_user}"
chown -R "%{os_user}:%{os_user}" "/var/lib/%{os_user}"

%postun
if which deluser >/dev/null 2>&1; then
	deluser --quiet "%{os_user}" > /dev/null || true
fi
		
delgroup --quiet openscada > /dev/null || true

%files
%defattr(-,root,root)
%attr(744,root,root) %{_profiledir}/openscada.sh
%config %{_defaultdir}/openscada
%dir %{_jardir}
%dir %{_cfgdir}
%dir %attr(775,root,openscada) %{_logdir}/openscada
%dir %{_datadir}/openscada

%changelog
* Tue Aug 20 2013 - jens.reimann@ibh-systems.com
- Adding user creation for RPM
* Tue Jul 31 2012 - jens.reimann@th4-systems.com
- Initial version
