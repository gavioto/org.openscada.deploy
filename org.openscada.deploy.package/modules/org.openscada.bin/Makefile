
default:

install:
	mkdir -p "$(DESTDIR)/usr/bin"
	install -m 0744 src/bin/th4Functions "$(DESTDIR)/usr/bin"
	install -m 0744 src/bin/th4Service "$(DESTDIR)/usr/bin"
	
	mkdir -p "$(DESTDIR)/usr/lib/perl5/TH4"
	install -m 0644 src/bin/TH4/Application.pm "$(DESTDIR)/usr/lib/perl5/TH4"
	install -m 0644 src/bin/TH4/Base.pm "$(DESTDIR)/usr/lib/perl5/TH4"
	install -m 0644 src/bin/TH4/JavaApplication.pm "$(DESTDIR)/usr/lib/perl5/TH4"

.PHONY: default install
