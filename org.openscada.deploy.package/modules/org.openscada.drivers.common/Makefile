
default:

install:
	install -d "$(DESTDIR)/etc/init"
	install upstart/*.conf "$(DESTDIR)/etc/init"
	
	install -d "$(DESTDIR)/etc/openscada/drivers"
	cp -av "configuration" "$(DESTDIR)/etc/openscada/drivers"

.PHONY: default install
