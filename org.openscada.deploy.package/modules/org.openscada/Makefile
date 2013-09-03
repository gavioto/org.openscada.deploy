
default:

TYPE ?= debian
ARCH ?= `uname -i`

install:
	install -d "$(DESTDIR)/usr/jar"
	install -d "$(DESTDIR)/etc/openscada"
	install -d "$(DESTDIR)/var/log/openscada"
	install -d "$(DESTDIR)/var/run/openscada"
	install -d "$(DESTDIR)/usr/share/openscada"
	install -d "$(DESTDIR)/var/lib/openscada"
	install -d "$(DESTDIR)/var/lib/openscada/hds.slave"
	install -d "$(DESTDIR)/var/lib/openscada/hds.master"
	
	install -d "$(DESTDIR)/etc/profile.d"
	install -m 0744 src/openscada.sh "$(DESTDIR)/etc/profile.d"
	
	install -d "$(DESTDIR)/etc/default"
	 
	test -f "src/openscada.$(TYPE).$(ARCH)" && install -m 0644 "src/openscada.$(TYPE).$(ARCH)" "$(DESTDIR)/etc/default/openscada"
	test -f "src/openscada.$(TYPE)" && install -m 0644 "src/openscada.$(TYPE)" "$(DESTDIR)/etc/default/openscada"

.PHONY: default install
