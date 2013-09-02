
default:

install:
	install -d "$(DESTDIR)/usr/bin"
	install -d "$(DESTDIR)/usr/share"
	unzip "unpack/p2director-linux.gtk.x86_64.zip" -d "$(DESTDIR)/usr/share"
	ln -s ../share/p2director/p2director $(DESTDIR)/usr/bin/p2director


.PHONY: default install
