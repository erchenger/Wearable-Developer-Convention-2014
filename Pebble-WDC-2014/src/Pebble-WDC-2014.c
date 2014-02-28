#include <pebble.h>

static Window *day_window;
static Window *time_slot_window;
static Window *classes_window;
static Window *about_window;

static MenuLayer *day_menu_layer;
static MenuLayer *time_slot_menu_layer;
static MenuLayer *classes_menu_layer;

static TextLayer *top_text_layer;
static TextLayer *bottom_text_layer;

static BitmapLayer *logo_layer;

static int day_selected;
static int time_slot_selected;

#define kWed830slot 2
#define kWed1045slot 4
#define kWed130slot 6

#define kThu830slot 1
#define kThu1100slot 4
#define kThu1215slot 6
#define kThu145slot 8
#define kThu315slot 10

#define kFri845slot 2
#define kFri1000slot 3
#define kFri1130slot 6
#define kFri145slot 8
#define kFri330slot 10

#define kWednesday 0
#define kThursday 1
#define kFriday 2
#define kAbout 3

// Classes Window


static int16_t classes_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
    return 132;
}

static void custom_cell_draw(GContext* ctx, Layer *cell_layer, char *title, char *speaker, char *level) {
	GRect bounds = layer_get_frame(cell_layer);
	graphics_context_set_text_color	(ctx, GColorBlack);
	graphics_draw_text(ctx,
                       title,
                       fonts_get_system_font(FONT_KEY_GOTHIC_18_BOLD),
                       GRect(0, 0, bounds.size.w, 90),
                       GTextOverflowModeWordWrap,
                       GTextAlignmentLeft,
                       NULL);
	graphics_draw_text(ctx,
                       speaker,
                       fonts_get_system_font(FONT_KEY_GOTHIC_14),
                       GRect(0, 95, bounds.size.w, 20),
                       GTextOverflowModeWordWrap,
                       GTextAlignmentLeft,
                       NULL);
    
	graphics_draw_text(ctx,
                       level,
                       fonts_get_system_font(FONT_KEY_GOTHIC_14_BOLD),
                       GRect(0, 110, bounds.size.w, 20),
                       GTextOverflowModeWordWrap,
                       GTextAlignmentLeft,
                       NULL);
    
}

static void draw_friday_845_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Analyze Communications and Security from Wearables", "Wilson Mar", "Intermediate");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Building Wearable Technology Applications for Behavior Modification: A Conceptual Overview", "Ashley Beattie", "Overview");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Harnessing the Power of the Other Sensors in Google Glass: There's more than just the Camera", "Kaiser-Pendergrast/Steinerman", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Leveraging Open-Source Hardware and Software for Perceptive Wearables", "Goksel Dedeoglu", "Overview");
            break;
    }    
}

static void draw_friday_1000_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Beyond Glass: Connecting the GDK with App Engine Web Services", "Kaiser-Pendergrast/Steinerman", "Intermediate (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "API and GDK Design for Google Glass", "Cecilia Abadie", "Overview");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Design and Engineering Principles for Wearables 2.0", "Rachel Kalmar", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Native App Development on Google Glass", "Jim McKeeth", "Intermediate (Code)");
            break;
    }    
}

static void draw_friday_1130_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Developing and Designing Finance Glassware", "Lawrence Wong", "Intermediate (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Gradle and Your Android Wearable Projects", "Mark Murphy", "Intermediate (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Made in China: How to Build Hardware with Less Than $10k", "Jason Gui", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Wearable and Bluetooth – Exploring the Details of Wireless Communications", "Vincent Gao", "Intermediate (Code)");
            break;
    }    
}

static void draw_friday_145_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "An Emotional Approach to the Design of Wearable Medical Devices", "Shaun Rahimi", "Overview (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Glass Development: Common use cases, Lessons Learned and Gotchas!", "Tejas Lagvankar", "Intermediate (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Is Thought the Future of Wearable Input?", "Jim McKeeth", "Intermediate (Code)");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Lean Hardware: Positioning, Financing and Retail", "Benjamin Joffe", "Overview");
            break;
    }    
}

static void draw_friday_330_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "APIs: The Secret to Making Wearables Relevant", "Hussain Chinoy/Ashish Vaid", "Intermediate (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Building Wearable Devices Through Rapid Prototyping", "Moe Tanabian", "Advanced (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Elegance, a Design Philosophy", "Mladen Barbaric", "Intermediate");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Making Android Bluetooth 4.0 Work", "Chris Herbert", "Advanced");
            break;
    }    
}



static void draw_thursday_830_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "An Overview of Computer Vision and how it can Enable Perceptive Wearables", "Goksel Dedeoglu", "Overview");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "API and GDK Design for Google Glass", "Cecilia Abadie", "Overview");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Creating Products for Google Glass at the Highest Level", "Mike DiGiovanni", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Android NDK Primer", "Ron Munitz", "Overview");
            break;
    }    
}

static void draw_thursday_1100_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Developers in the Doctor’s Office: How Wearables are Changing the way we give and Receive Care", "Andrei Pop", "Intermediate");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Glassware UI Design", "Matt Abdou", "Overview");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Security Challenges in Wearables", "Ray Potter", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Using WearScript for Powerful Rapid Prototyping on Google Glass", "Brandyn White", "Overview");
            break;
    }    
}

static void draw_thursday_1215_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Ensuring Your Wearable Apps Delight Users and Beat the Competition", "John Montgomery", "Overview (sponsored by uTest)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Sony SmartWatch 2: Get a Headstart on Wearable Apps Development", "Anupam Nath", "Overview (sponsored by Sony)");
            break;
    }    
}

static void draw_thursday_145_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "APIs and Hardware: The Current Tradeoff", "Fabrizio Filippini", "Intermediate (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Hybrid Glassware", "Jenny Murphy", "Advanced (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Publishing Your Google Glass App", "Matt Abdou", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Wearable Springboard: High Performance, Low Power Motion Technology", "David B. Karlin", "Intermediate");
            break;
    }    
}

static void draw_thursday_315_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Beyond Activity Trackers: Sport Wearables Design", "Jen Costillo", "Advanced (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Deep Dive into Google Glass Live Cards", "Luis de la Rosa", "Advanced (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Social Smarts for Small Screens", "Sonia Koesterer", "Overview");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "When Microwatts Are Precious: Battery Tips for Wearable Apps", "Mark Murphy", "Overview");
            break;
    }    
}

static void draw_wednesday_830_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Developing for Wearable Devices with Android", "Dario Laverde", "Intermediate Tutorial (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Filming and Broadcasting with Google Glass", "Jeris JC Miller", "Overview Tutorial");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Headless Android", "Ron Munitz", "Intermediate Tutorial (Code)");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "How to Develop Your Wearable Electronics from Idea to Production", "Fabrizio Filippini", "Intermediate Tutorial (Code)");
            break;
    }    
}

static void draw_wednesday_1045_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Introduction to Wearable Development with Pebble", "Thomas Sarlandie", "Advanced Tutorial (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Prototyping New Wearable Experiences with Soft Electronics and Arduinos", "Pearl Chen", "Intermediate Tutorial (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "Transitioning from Android to Google Glass", "Luis de la Rosa", "Intermediate Tutorial (Code)");
            break;
    }    
}

static void draw_wednesday_130_cell ( GContext* ctx, Layer *cell_layer, int index ){
    switch (index) {
        case 0:
            custom_cell_draw(ctx, cell_layer, "Building Wearable Technology Applications for Behavior Modification", "Ashley Beattie", "Advanced Tutorial (Code)");
            break;
        case 1:
            custom_cell_draw(ctx, cell_layer, "Hardware Glassware: Building Bluetooth-Enabled Accessories for Glass", "Zack Freedman", "Advanced Tutorial (Code)");
            break;
        case 2:
            custom_cell_draw(ctx, cell_layer, "ROM Cooking: A Hands-on, \"Do it at Home\" Approach", "Ron Munitz", "Intermediate Tutorial (Code)");
            break;
        case 3:
            custom_cell_draw(ctx, cell_layer, "Wearable Hacking with Raspberry Pi, Google Glass, Motors and Camera", "Mark Scheel", "Overview Tutorial (Code)");
            break;
    }    
}

static void draw_wednesday_cell( GContext* ctx, Layer *cell_layer, int index ) {
    switch (time_slot_selected) {
        case kWed830slot:
            draw_wednesday_830_cell( ctx, cell_layer, index);
            break;
        case kWed1045slot:
            draw_wednesday_1045_cell( ctx, cell_layer, index);
            break;
        case kWed130slot:
            draw_wednesday_130_cell( ctx, cell_layer, index);
            break;
            
    }
}

static void draw_thursday_cell( GContext* ctx, Layer *cell_layer, int index ) {
    switch (time_slot_selected) {
        case kThu830slot:
            draw_thursday_830_cell( ctx, cell_layer, index);
            break;
        case kThu1100slot:
            draw_thursday_1100_cell( ctx, cell_layer, index);
            break;
        case kThu1215slot:
            draw_thursday_1215_cell( ctx, cell_layer, index);
            break;
        case kThu145slot:
            draw_thursday_145_cell( ctx, cell_layer, index);
            break;
        case kThu315slot:
            draw_thursday_315_cell( ctx, cell_layer, index);
            break;
            
    }
}

static void draw_friday_cell( GContext* ctx, Layer *cell_layer, int index ) {
    switch (time_slot_selected) {
        case kFri845slot:
            draw_friday_845_cell( ctx, cell_layer, index);
            break;
        case kFri1000slot:
            draw_friday_1000_cell( ctx, cell_layer, index);
            break;
        case kFri1130slot:
            draw_friday_1130_cell( ctx, cell_layer, index);
            break;
        case kFri145slot:
            draw_friday_145_cell( ctx, cell_layer, index);
            break;
        case kFri330slot:
            draw_friday_330_cell( ctx, cell_layer, index);
            break;
    }
}

static void classes_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    const int index = cell_index->row;
    switch ( day_selected ) {
        case kWednesday:
            draw_wednesday_cell( ctx, cell_layer, index);
            break;
            
        case kThursday:
            draw_thursday_cell( ctx, cell_layer, index);
            break;
        
        case kFriday:
            draw_friday_cell( ctx, cell_layer, index);
            break;

    }
}

static uint16_t classes_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
    if ( day_selected == kWednesday && time_slot_selected == kWed1045slot ) {
        return 3;
    }
    
    if ( day_selected == kThursday && time_slot_selected == kThu1215slot ) {
        return 2;
    }
    
    return 4;
}

static void classes_window_load(Window *window) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "classes_window_load start");
    
    Layer *window_layer = window_get_root_layer(window);
    
    GRect window_frame = layer_get_frame(window_layer);
    classes_menu_layer = menu_layer_create(window_frame);
    menu_layer_set_callbacks(classes_menu_layer, NULL, (MenuLayerCallbacks) {
        .get_cell_height = (MenuLayerGetCellHeightCallback) classes_get_cell_height_callback,
        .draw_row = (MenuLayerDrawRowCallback) classes_draw_row_callback,
        .get_num_rows = (MenuLayerGetNumberOfRowsInSectionsCallback) classes_get_num_rows_callback
    });
    menu_layer_set_click_config_onto_window(classes_menu_layer, window);
    layer_add_child(window_layer, menu_layer_get_layer(classes_menu_layer));
    APP_LOG(APP_LOG_LEVEL_DEBUG, "classes_window_load end");
    
}

static void classes_window_unload(Window *window) {
    time_slot_selected = -1;
    menu_layer_destroy( classes_menu_layer );
}





// Time Slot Window


static void draw_wednesday_time_slot_cell(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    const int index = cell_index->row;
    switch (index) {
        case 0:
            menu_cell_basic_draw(ctx, cell_layer, "7:30am - 6:30pm", "Registration Open", NULL);
            break;
        case 1:
            menu_cell_basic_draw(ctx, cell_layer, "7:30 - 8:30am", "Morning Coffee", NULL);
            break;
        case kWed830slot:
            menu_cell_basic_draw(ctx, cell_layer, "8:30 - 10:30am", "Tutorials", NULL);
            break;
        case 3:
            menu_cell_basic_draw(ctx, cell_layer, "10:30 - 10:45am", "Coffee Break", NULL);
            break;
        case kWed1045slot:
            menu_cell_basic_draw(ctx, cell_layer, "10:45am - 12:45pm", "Tutorials", NULL);
            break;
        case 5:
            menu_cell_basic_draw(ctx, cell_layer, "12:45 - 1:30pm", "Lunch", NULL);
            break;
        case kWed130slot:
            menu_cell_basic_draw(ctx, cell_layer, "1:30 - 3:30pm", "Tutorials", NULL);
            break;
        case 7:
            menu_cell_basic_draw(ctx, cell_layer, "3:30 - 3:45pm", "Coffee Break", NULL);
            break;
        case 8:
            menu_cell_basic_draw(ctx, cell_layer, "4:00 - 5:30pm", "Fireside Chats", NULL);
            break;
    }
}

static void draw_thursday_time_slot_cell(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    const int index = cell_index->row;
    switch (index) {
        case 0:
            menu_cell_basic_draw(ctx, cell_layer, "7:30 - 8:30am", "Morning Coffee", NULL);
            break;
        case kThu830slot:
            menu_cell_basic_draw(ctx, cell_layer, "8:30 - 9:30am", "Technical Classes", NULL);
            break;
        case 2:
            menu_cell_basic_draw(ctx, cell_layer, "9:30 - 9:45am", "Coffee Break", NULL);
            break;
        case 3:
            menu_cell_basic_draw(ctx, cell_layer, "10:30 - 10:45am", "Keynote: Jenny Murphy", NULL);
            break;
        case kThu1100slot:
            menu_cell_basic_draw(ctx, cell_layer, "11:00am - 12:00pm", "Technical Classes", NULL);
            break;
        case 5:
            menu_cell_basic_draw(ctx, cell_layer, "12:00 - 7:45pm", "Exhibit Hall Open", NULL);
            break;
        case kThu1215slot:
            menu_cell_basic_draw(ctx, cell_layer, "12:15 - 12:45pm", "Sponsored Classes", NULL);
            break;
        case 7:
            menu_cell_basic_draw(ctx, cell_layer, "12:45 - 1:45pm", "Lunch", NULL);
            break;
        case kThu145slot:
            menu_cell_basic_draw(ctx, cell_layer, "1:45 - 2:45pm", "Technical Classes", NULL);
            break;
        case 9:
            menu_cell_basic_draw(ctx, cell_layer, "2:45 - 3:15pm", "Ice Cream Social", NULL);
            break;
        case kThu315slot:
            menu_cell_basic_draw(ctx, cell_layer, "3:15 - 4:15pm", "Technical Classes", NULL);
            break;
        case 11:
            menu_cell_basic_draw(ctx, cell_layer, "4:30-5:30", "Keynote: Phillipe Kahn", NULL);
            break;
        case 12:
            menu_cell_basic_draw(ctx, cell_layer, "5:30 - 6:15pm", "Lightning Talks", NULL);
            break;
        case 13:
            menu_cell_basic_draw(ctx, cell_layer, "6:15 - 7:30pm", "Networking Social", NULL);
            break;
    }
}

static void draw_friday_time_slot_cell(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    const int index = cell_index->row;
    switch (index) {
        case 0:
            menu_cell_basic_draw(ctx, cell_layer, "7:30am - 4:00pm", "Registration Open", NULL);
            break;
        case 1:
            menu_cell_basic_draw(ctx, cell_layer, "7:30 - 8:45", "Morning Coffee", NULL);
            break;
        case kFri845slot:
            menu_cell_basic_draw(ctx, cell_layer, "8:45 - 9:45am", "Technical Classes", NULL);
            break;
        case kFri1000slot:
            menu_cell_basic_draw(ctx, cell_layer, "10:00 - 11:00am", "Technical Classes", NULL);
            break;
        case 4:
            menu_cell_basic_draw(ctx, cell_layer, "11:00am - 3:30pm", "Exhibit Hall Open", NULL);
            break;
        case 5:
            menu_cell_basic_draw(ctx, cell_layer, "11:00 - 11:30am", "Coffee Break", NULL);
            break;
        case kFri1130slot:
            menu_cell_basic_draw(ctx, cell_layer, "11:30am - 12:30pm", "Technical Classes", NULL);
            break;
        case 7:
            menu_cell_basic_draw(ctx, cell_layer, "12:45 - 1:45pm", "Lunch", NULL);
            break;
        case kFri145slot:
            menu_cell_basic_draw(ctx, cell_layer, "1:45 - 2:45pm", "Technical Classes", NULL);
            break;
        case 9:
            menu_cell_basic_draw(ctx, cell_layer, "2:45 - 3:15pm", "Winner's Circle", NULL);
            break;
        case kFri330slot:
            menu_cell_basic_draw(ctx, cell_layer, "3:30 - 4:30pm", "Technical Classes", NULL);
            break;
        case 11:
            menu_cell_basic_draw(ctx, cell_layer, "4:30pm", "Conference Closes", NULL);
            break;
    }
}

static int16_t time_slot_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
    return 44;
}


static void time_slot_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    switch ( day_selected ) {
        case kWednesday:
            draw_wednesday_time_slot_cell( ctx, cell_layer, cell_index, data );
            break;
        case kThursday:
            draw_thursday_time_slot_cell( ctx, cell_layer, cell_index, data );
            break;
        case kFriday:
            draw_friday_time_slot_cell( ctx, cell_layer, cell_index, data );
            break;
    }
}

static uint16_t time_slot_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
    switch ( day_selected ) {
        case kWednesday:
            return 9;
            break;
        case kThursday:
            return 14;
            break;
        case kFriday:
            return 12;
            break;
    }
    return 4;
}

static bool should_time_slot_advance() {
    bool shouldAdvance = false;
    
    if ( ( day_selected == kWednesday ) && 
        ( time_slot_selected == kWed830slot || time_slot_selected == kWed1045slot || time_slot_selected == kWed130slot ) ) {
        shouldAdvance = true;
    }
    if ( ( day_selected == kThursday ) && 
        ( time_slot_selected == kThu830slot || time_slot_selected == kThu1100slot || time_slot_selected == kThu1215slot || time_slot_selected == kThu145slot || time_slot_selected == kThu315slot ) ) {
        shouldAdvance = true;
    }
    if ( ( day_selected == kFriday ) &&
        ( time_slot_selected == kFri845slot || time_slot_selected == kFri1000slot || time_slot_selected == kFri1130slot || time_slot_selected == kFri145slot || time_slot_selected == kFri330slot ) ) {
        shouldAdvance = true;
    }
    
    return shouldAdvance;
}

static void time_slot_select_callback(MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "Time Slot Select");
    
    time_slot_selected = cell_index->row;
    
    
    
    if ( should_time_slot_advance() ) {
        classes_window = window_create();
        window_set_window_handlers(classes_window, (WindowHandlers) {
            .load = classes_window_load,
            .unload = classes_window_unload,
        });
        window_stack_push( classes_window, true );
    }
}



static void time_slot_window_load(Window *window) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "time_slot_window_load start");
    
    Layer *window_layer = window_get_root_layer(window);
    
    GRect window_frame = layer_get_frame(window_layer);
    time_slot_menu_layer = menu_layer_create(window_frame);
    menu_layer_set_callbacks(time_slot_menu_layer, NULL, (MenuLayerCallbacks) {
        .get_cell_height = (MenuLayerGetCellHeightCallback) time_slot_get_cell_height_callback,
        .draw_row = (MenuLayerDrawRowCallback) time_slot_draw_row_callback,
        .get_num_rows = (MenuLayerGetNumberOfRowsInSectionsCallback) time_slot_get_num_rows_callback,
        .select_click = (MenuLayerSelectCallback) time_slot_select_callback
    });
    menu_layer_set_click_config_onto_window(time_slot_menu_layer, window);
    layer_add_child(window_layer, menu_layer_get_layer(time_slot_menu_layer));
    APP_LOG(APP_LOG_LEVEL_DEBUG, "time_slot_window_load end");
    
}

static void time_slot_window_unload(Window *window) {
    day_selected = -1;
    menu_layer_destroy( time_slot_menu_layer );
}

// About Window


static void about_window_load(Window *window) {
    Layer *window_layer = window_get_root_layer(window);
    
    logo_layer = bitmap_layer_create( GRect( 0, 60, 144, 25 ) );
    bitmap_layer_set_bitmap( logo_layer, gbitmap_create_with_resource( RESOURCE_ID_MM_LOGO ) );
    layer_add_child( window_layer, bitmap_layer_get_layer( logo_layer ) );
    
    top_text_layer = text_layer_create( GRect ( 10, 20, 144, 30 ) );
    text_layer_set_font( top_text_layer, fonts_get_system_font( FONT_KEY_GOTHIC_14 ) );
    text_layer_set_text( top_text_layer, "Brought to you by the friendly folks at");
    layer_add_child( window_layer, text_layer_get_layer( top_text_layer ) );
    
    bottom_text_layer = text_layer_create( GRect ( 10, 115, 144, 50 ) );
    text_layer_set_font( bottom_text_layer, fonts_get_system_font( FONT_KEY_GOTHIC_14 ) );
    text_layer_set_text( bottom_text_layer, "Codez by Sean McMains sean@mcmains.net");
    layer_add_child( window_layer, text_layer_get_layer( bottom_text_layer ) );
    
}

static void about_window_unload(Window *window) {
    text_layer_destroy( top_text_layer );
    text_layer_destroy( bottom_text_layer );
    bitmap_layer_destroy( logo_layer );
}





// Day Window

static int16_t day_get_cell_height_callback(struct MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
    return 44;
}

static void day_draw_row_callback(GContext* ctx, Layer *cell_layer, MenuIndex *cell_index, void *data) {
    const int index = cell_index->row;
    switch (index) {
        case kWednesday:
            menu_cell_basic_draw(ctx, cell_layer, "Wednesday", "March 5", gbitmap_create_with_resource( RESOURCE_ID_CALENDAR_ICON ) );
            break;
        case kThursday:
            menu_cell_basic_draw(ctx, cell_layer, "Thursday", "March 6", gbitmap_create_with_resource( RESOURCE_ID_CALENDAR_ICON ));
            break;
        case kFriday:
            menu_cell_basic_draw(ctx, cell_layer, "Friday", "March 7", gbitmap_create_with_resource( RESOURCE_ID_CALENDAR_ICON ));
            break;
        case 3:
            menu_cell_basic_draw(ctx, cell_layer, "About", NULL, NULL);
    }
}

static uint16_t day_get_num_rows_callback(struct MenuLayer *menu_layer, uint16_t section_index, void *data) {
    return 4;
}

static void push_time_slot_window() {
    time_slot_window = window_create();
    window_set_window_handlers(time_slot_window, (WindowHandlers) {
        .load = time_slot_window_load,
        .unload = time_slot_window_unload,
    });
    window_stack_push( time_slot_window, true );
}

static void push_about_window() {
    about_window = window_create();
    window_set_window_handlers(about_window, (WindowHandlers) {
        .load = about_window_load,
        .unload = about_window_unload,
    });
    window_stack_push( about_window, true );    
}

static void day_select_callback(MenuLayer *menu_layer, MenuIndex *cell_index, void *data) {
    APP_LOG(APP_LOG_LEVEL_DEBUG, "Day Select");
    
    day_selected = cell_index->row;
    
    if ( day_selected == kAbout ) {
        push_about_window();
    } else {
        push_time_slot_window();
    }
}

static void day_window_load(Window *window) {
    Layer *window_layer = window_get_root_layer(window);
    
    GRect window_frame = layer_get_frame(window_layer);
    day_menu_layer = menu_layer_create(window_frame);
    menu_layer_set_callbacks(day_menu_layer, NULL, (MenuLayerCallbacks) {
        .get_cell_height = (MenuLayerGetCellHeightCallback) day_get_cell_height_callback,
        .draw_row = (MenuLayerDrawRowCallback) day_draw_row_callback,
        .get_num_rows = (MenuLayerGetNumberOfRowsInSectionsCallback) day_get_num_rows_callback,
        .select_click = (MenuLayerSelectCallback) day_select_callback,
    });
    menu_layer_set_click_config_onto_window(day_menu_layer, window);
    layer_add_child(window_layer, menu_layer_get_layer(day_menu_layer));
}

static void day_window_unload(Window *window) {
    menu_layer_destroy(day_menu_layer);
}




static void init(void) {
    day_window = window_create();
    window_set_window_handlers(day_window, (WindowHandlers) {
        .load = day_window_load,
        .unload = day_window_unload,
    });
    window_stack_push(day_window, true);
}

static void deinit(void) {
    window_destroy(day_window);
}

int main(void) {
    init();
    app_event_loop();
    deinit();
}
