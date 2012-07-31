
default:

install:
	install -d "$(DESTDIR)/usr/jar"
	install -d "$(DESTDIR)/usr/configuration"
	
	install -d "$(DESTDIR)/etc/profile.d"	
	install -m 0744 src/th4.sh "$(DESTDIR)/etc/profile.d"

.PHONY: default install
