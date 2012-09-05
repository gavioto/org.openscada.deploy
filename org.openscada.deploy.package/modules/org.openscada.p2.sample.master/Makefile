
default:

install:
	install -d "$(DESTDIR)/usr/bin/"
	install -d "$(DESTDIR)/usr/share/openscada/samples"
	install -d "$(DESTDIR)/usr/share/openscada/profiles"
	install -d "$(DESTDIR)/etc/init/"
	
	install -m 0644 src/init/openscada.master.sample.conf "$(DESTDIR)/etc/init/openscada.master.sample.conf"
	install -m 0755 src/bin/osCreateMasterDB "$(DESTDIR)/usr/bin/"
	install -m 0755 src/share/osCreateMasterDB.db.sql "$(DESTDIR)/usr/share/openscada/samples/"
	install -m 0755 src/share/osCreateMasterDB.tables.sql "$(DESTDIR)/usr/share/openscada/samples/"
	
	cp -av src/* "$(DESTDIR)/usr/share/openscada/profiles"

.PHONY: default install
