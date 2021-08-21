package com.aliucord.plugins.layoutcontroller.patchers;

import com.aliucord.plugins.layoutcontroller.patchers.base.BasePatcher;
import com.aliucord.plugins.layoutcontroller.util.Const;
import com.aliucord.plugins.layoutcontroller.util.Util;
import com.discord.widgets.channels.list.WidgetChannelsListAdapter;
import com.discord.widgets.channels.list.items.ChannelListItem;

import top.canyie.pine.Pine;

public class ChannelsInviteButtonPatch extends BasePatcher {

    public ChannelsInviteButtonPatch() throws Exception {
        super(Const.Key.INVITE_BUTTON_CHANNELS_KEY, Const.Description.INVITE_BUTTON_CHANNELS_DESCRIPTION, WidgetChannelsListAdapter.ItemInvite.class.getDeclaredMethod("onConfigure", int.class, ChannelListItem.class));
    }

    @Override
    public void patchBody(Pine.CallFrame callFrame) {
        var itemView = ((WidgetChannelsListAdapter.ItemInvite) callFrame.thisObject).itemView;
        Util.hideViewCompletely(itemView);
        callFrame.setResult(callFrame.getResult());
    }
}
