# Work specific macros not checked into github
include "workmacros.sc"
include "macros.sc"

remapblock
 # Arrow keys
 EXTRA_BACKSLASH    UP
 LANG_4             LEFT
 INTERNATIONAL_4    RIGHT
 LANG_3             DOWN
 INTERNATIONAL_5    DOWN

 # Misc
 BACK_QUOTE         ESC
 LALT               LCTRL
 LCTRL              LALT
 CAPS_LOCK          LGUI   # Caps lock is winkey.
 F21                EUROPE_2
 F22                RALT
 F23                RCTRL

 # Keys above arrows row 1
 FAKE_18            INSERT
 INTERNATIONAL_2    HOME
 PAD_ASTERIX        PAGE_UP

 # Keys above arrows row 2
 EXTRA_LALT         DELETE
 EXTRA_RALT         END
 INTERNATIONAL_1    PAGE_DOWN
 
 # PF1
 EXTRA_SYSRQ        F11
 # PF2
 EXTRA_F8           F12
 # PF12
 EXTRA_F3           MEDIA_VOLUME_DOWN
 # PF13
 EXTRA_F4           CAPS_LOCK
 # PF14
 EXTRA_F5           PRINTSCREEN
 # PF24
 F20                MEDIA_VOLUME_UP

 # Numpad
 ESC                PRINTSCREEN
 INTERNATIONAL_3    BACKSPACE
 PAD_COMMA          PAD_PLUS
 PAD_PLUS           PAD_ENTER

endblock

