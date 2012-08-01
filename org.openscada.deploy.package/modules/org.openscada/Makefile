
default:

install:
	install -d "$(DESTDIR)/usr/jar"
	install -d "$(DESTDIR)/etc/openscada"
	
	install -d "$(DESTDIR)/etc/profile.d"	
	install -m 0744 src/th4.sh "$(DESTDIR)/etc/profile.d"
	install -m 0644 src/th4 "$(DESTDIR)/etc/default"

.PHONY: default install
