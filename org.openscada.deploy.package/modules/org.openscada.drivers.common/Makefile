
default:

install:
	install -d "$(DESTDIR)/etc/init"
	install -m 0644 upstart/*.conf "$(DESTDIR)/etc/init"
	
	install -d "$(DESTDIR)/etc/openscada/drivers"
	cp -av configuration/* "$(DESTDIR)/etc/openscada/drivers"

.PHONY: default install
